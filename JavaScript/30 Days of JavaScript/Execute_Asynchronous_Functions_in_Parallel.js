/**
 * @param {Array<Function>} functions
 * @return {Promise<any>}
 */
var promiseAll = function (functions) {
  if (functions.length === 0) {
    return Promise.resolve([]);
  }

  const outputs = new Array(functions.length);
  let resolveCounter = 0;

  return new Promise((resolve, reject) => {
    functions.forEach((promise, index) => {
      promise()
        .then((value) => {
          outputs[index] = value;
          resolveCounter += 1;
          if (resolveCounter === functions.length) {
            resolve(outputs);
          }
        })
        .catch(reject);
    });
  });
};

/**
 * const promise = promiseAll([() => new Promise(res => res(42))])
 * promise.then(console.log); // [42]
 */

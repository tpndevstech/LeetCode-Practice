/**
 * @param {Array} arr1
 * @param {Array} arr2
 * @return {Array}
 */
var join = function (arr1, arr2) {
  const objMap = {};

  for (const obj of arr1) {
    objMap[obj.id] = obj;
  }

  for (const obj of arr2) {
    objMap[obj.id] = { ...objMap[obj.id], ...obj };
  }

  return Object.values(objMap);
};

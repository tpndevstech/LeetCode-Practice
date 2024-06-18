/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    const chunkArray = []
    let index = 0

    while (index < arr.length) {
        chunkArray.push(arr.slice(index, size + index))
        index += size
    }

    return chunkArray;
};

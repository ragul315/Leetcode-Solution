/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    var val= init;
    for(let a of nums){
        val=fn(val,a);
    }
    return val;
};
import binarySearch from "./binary-search";

const num_array: number[] = [1, 3, 5, 7, 9];
const string_array: string[] = ["a", "b", "c", "d"];

console.log(binarySearch(num_array, 3));
console.log(binarySearch(num_array, -3));

console.log(binarySearch(string_array, "c"));
console.log(binarySearch(string_array, "z"));

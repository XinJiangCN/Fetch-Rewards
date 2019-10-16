package com.example.Fetch.Controller

import org.springframework.web.bind.annotation.*


@RestController
class CheckPyramidController {

    @GetMapping("/isPyramid")
    fun isPyramid (@RequestParam(value = "str") str : String): Boolean {
        var hm : HashMap<Char,Int> = HashMap()
        val charArr = str.toCharArray()
        //iterate through the char array and get frequencies of all char
        for (i in charArr) {
               if (hm.containsKey(i))
                   //if there exists this key, increase the counter
                   hm.put(i, hm.get(i)!!.plus(1))
               else
                   //if this is the first time this key appear, put it in hm with counter 1
                   hm.put(i, 1)
        }
        //sort the map by its value
        val sortedMap = hm.toList().sortedBy { (_, value ) -> value }.toMap()
        //the current stands for the the current char frequency if this is a pyramid number starting from 0
        for ((current, i) in sortedMap.values.withIndex()) {
            if (i != current + 1)
                //if current frequency does not match the pyramid situation, simply return false
                return false
        }
        return true
    }
}
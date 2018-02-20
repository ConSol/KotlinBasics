package com.consol.kotlin

/**
 * Created by Malte Bucksch on 06/11/2017.
 */

fun String.barkify(): String {
    return this.split(" ").map { word -> "Wuff" }.joinToString(" ");
}
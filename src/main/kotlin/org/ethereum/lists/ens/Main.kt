package org.ethereum.lists.ens

import org.ethereum.lists.cilib.checkFields
import java.io.File

fun main(args: Array<String>) {
    listOf("urls-darklist.json","urls-lightlist.json")
            .map { File(it) }
            .forEach { it.checkFields(mandatoryFields = listOf("id", "comment")) }
}

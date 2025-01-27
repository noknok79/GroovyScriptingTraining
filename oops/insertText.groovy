import groovy.io.FileType

def directory = new File('/mnt/c/WSL2/groovytraining')
def textToInsert = "// Mark Villanueva\n// mark.a.b.villanueva\n"

directory.eachFileRecurse(FileType.FILES) { file ->
    if (file.name.endsWith('.groovy')) {
        def content = file.text
        if (!content.contains('// Mark Villanueva') && !content.contains('// mark.a.b.villanueva')) {
            file.text = textToInsert + content
            println "Inserted text into: ${file.name}"
        } else {
            println "Skipped file: ${file.name}"
        }
    }
}

def deleteInsertedTextLines(file) {
    def lines = file.readLines()
    file.text = filteredLines.join('\n')
}

directory.eachFileRecurse(FileType.FILES) { file ->
    if (file.name.endsWith('.groovy')) {
        deleteInsertedTextLines(file)
    }
}
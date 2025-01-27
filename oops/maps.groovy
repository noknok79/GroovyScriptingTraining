// Mark Villanueva
// mark.a.b.villanueva
class MapExamples {
    void printExamples() {
        def map = [name: "Groovy", version: "3.0.7", type: "Programming Language"]
        println "Map: ${map}"

        map['creator'] = 'James Strachan'; map.put('year', 2003)
        println "After adding elements: ${map}"

        map.remove('type')
        println "After removing elements: ${map}"

        println "Name: ${map['name']}"; println "Version: ${map.version}"

        println "Iterating over map:"
        map.each { key, value -> println "$key: $value" }

        println "Found element: ${map.find { it.key == 'creator' }}"
        println "Filtered elements: ${map.findAll { it.value instanceof String }}"

        println "Contains key 'name': ${map.containsKey('name')}"
        println "Contains value 'Groovy': ${map.containsValue('Groovy')}"

        println "Keys: ${map.keySet()}"; println "Values: ${map.values()}"

        def map2 = [platform: "JVM", license: "Apache"]
        println "Merged map: ${map + map2}"
    }
}

new MapExamples().printExamples()
// Define the paragraph
def paragraph = "Groovy is a powerful, optionally typed and dynamic language. It can be used for scripting and more!"

// Define the regular expression pattern to search for letters
def pattern = ~/[a-zA-Z]/

// Create a matcher from the paragraph and pattern
def matcher = pattern.matcher(paragraph)

// Initialize an empty list to store the letters found
def lettersFound = []

// Use a while loop to find all letters in the paragraph
while (matcher.find()) {
    // Add each letter found to the list
    lettersFound << matcher.group()
}

// Print the letters found
println "Letters found in the paragraph: $lettersFound"

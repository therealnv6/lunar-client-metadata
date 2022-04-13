# lunar-client-metadata
An easy-to-use wrapper for Lunar Client's game api.

## Importing:
Our project is available on [jitpack](https://jitpack.io).

### Maven
<details>
  <summary>pom.xml</summary>
  
  ``` xml
  <repositories>
      <repository>
          <id>jitpack.io</id>
          <url>https://jitpack.io</url>
      </repository>
  </repositories>

  <dependencies>
    <dependency>
	    <groupId>com.github.devrawr</groupId>
	    <artifactId>lunar-client-metadata</artifactId>
	    <version>f45666a0ba</version>
	</dependency>  
  </dependencies>
  ```
</details>

### Gradle
<details>
  <summary>build.gradle</summary>
  
  ```groovy
  def lcMetaHash = "f45666a0ba"
    
  repositories {
    maven { url "https://jitpack.io" }
  }
    
  dependencies {
    api "com.github.devrawr:lunar-client-metadata:$lcMetaHash"
  }
  ```
</details>

## Usage:
Since all of the game metadata is mapped, you're able to do anything with the data returned.

Get the latest blog post:
```kt
fun latestBlogPost()
{
    val metadata = LunarClientMetadata
        .parseMetadata()
    
    val latestBlogPost = metadata
        .getLatestBlogPost()
    
    println(
        "excerpt: ${latestBlogPost.excerpt}",
        "wow!"
    )
}
```

For more possible use cases, take a look at the data provided in our [LunarClientMetadata](https://github.com/devrawr/lunar-client-metadata/blob/main/src/main/kotlin/io/github/devrawr/lunar/model/LunarClientMetadata.kt) class.

## Notice:
Lunar Client's developers may decide to restrict access to this endpoint as this was never intended to be exposed to the public. **This project may not work in the future.**
 - In addition to this, the content returned from the metadata endpoint may change, so our mappings might not be accurate in the future.

## Authors:
- [@GrowlyX](https://github.com/GrowlyX)
- [@devrawr](https://github.com/devrawr)

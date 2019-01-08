# Micronaut-world v1.2.0
Micronaut framework basic application - Based on Microservices

This framework is build to provide productivity in the microservices and the cloud computing.

It is currently supporting these three languages:

1. Java
2. Groovy
3. Kotlin

### Installation steps:

Run the following commands


### Micronaut is mainly focused on the 

1. Least use of reflection.
2. Avoiding proxies.
3. Optimize start-up time.
4. Reduce memory footprint.
5. Provide clear, understandable error handling.

Source: [Link](https://docs.micronaut.io/latest/guide/index.html)

and who is hero behind above features `Annotation Processors` in case of Java and `AST transformatin` for the `Groovy`. Micronaut performs dependency injection without
`reflection`, It is possible because of 

#### The key is a set of AST transformations (for Groovy) and annotation processors (for Java) that generate classes that implement the BeanDefinition interface. The ASM byte-code library is used to generate classes and because Micronaut knows ahead of time the injection points, there is no need to scan all of the methods, fields, constructors, etc. at runtime like other frameworks such as Spring do.

Ref: https://docs.micronaut.io/latest/guide/index.html#how

### Language and frameworks:

you can chaneg the language and frameworks by setting them inside the `micronaut-cli.yml` which is present at the root

```
testFramework: spock // JUnit
sourceLanguage: groovy // Java or Kotlin

```

### Changing Port

To change the port on which application will run,

```
micronaut:
    server:
      port: 8086 // You can set it to -1 to run on random ports
```
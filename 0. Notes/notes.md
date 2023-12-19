# `this` Keyword

The last piece to add to our work with classes is a remarkably important one: the `this` keyword. While important, it is one that technically is never required, but can make code so much more readable, and solves an issue we came up with in the last section!

---

## `this` Keyword

When working in a constructor or non-`static` method, the `this` keyword refers to the current object (the one calling this constructor or method), and can be used with the dot operator to more specifically get the information we were already going to get.

Let's look at how this can impact how we write a constructor. Here is the original constructor for the `Person` class:

```java
public Person(String n, int a) {
    name = n;
    age = a;
}
```

We are familiar at this point with constructors that look like this. While it may end up being longer (more characters to write everything), we can make this easier for another programmer reading the class to understand what is going on. First, anytime we reference an instance variable or a non-`static` method (none of those here), we can put `this.` in front of them to specify where the information is coming from:

```java
public Person(String n, int a) {
    this.name = n;
    this.age = a;
}
```

Now it is more clear to a reader that we adjusting the instance varaibles `name` and `age`, and not local variables. How can we make it easier to the reader to understand what `n` and `a` are for though? In the last section we said we couldn't name them `name` and `age` because that would override the instance variables we are trying to assign. However, with the new `this` keyword, we can copy the names and still access the instance variable versions using `this.name` and `this.age`, while `name` and `age` will be the local parameter variables:

```java
public Person(String name, int age) {
    this.name = name;
    this.age = age;
}
```

This is the peak of our constructor writing, as it is now more evident than ever to a reader *exactly* what it is doing, without actually changing the result!

It is considered good practice to utilize `this` anytime you are referencing an instance variable or non-`static` method because of this readability.

---

## Using `this` in a Method Call

While not an overly-common scenario, sometimes we want to call a method (`static` or non-`static`) with our current object from another method. What does this look like? Here is an example of a `static` method `oldOrYoung` in the `Person.java` file:

```java
public static String oldOrYoung(Person p) {
    if (p.age < 30) {
        return "young";
    } else {
        return "old";
    }
}
```

If I wanted my toString method to reference whether the `Person` is old or young, I need to be able to call this method with a `Person` object from within the `toString` method! Here is what our updated `toString` method could look like this:

```java
public String toString() {
    return name + " is a " + oldOrYoung(this) + " person.";
}
```

Before the keyword `this`, we wouldn't have had anything to put in the parameter for `oldOrYoung`, meaning we just couldn't have done this. We would have had to design the `oldOrYoung` method to be non-`static`, which is very doable, but maybe not what we wanted to have to do!

---

## Assignment

Now that you have gone through the notes for this section, you can check out the `Try.md` and `Try.java` files to try a short assignment using this material.

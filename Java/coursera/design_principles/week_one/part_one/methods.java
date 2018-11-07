//the process of selecting which implementation operation to call at run time is known as a dynamic dispatch. 
//POJO = Plain Old Java object  cannot create object without all characteristics

//filtering data
    //should you write twice if it's similar codes, but different concepts? (probably not as you should not duplicate code. )



//https://www.baeldung.com/assertJ-java-8-features
//Satisfies Helper Method
    //allows you to quickly check if an object satisfies all provided assertions
    String givenString = "someString";

    assertThat(givenString).satisfies(s -> {
        assertThat(s).isNotEmpty();
        assertThat(s).hasSize(10);
    });
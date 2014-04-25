# postdoc

Clojure library for documenting clojure programs in more details.
Key ideas are :
1) Add more detailed documentation, more suitable than just a doc String.
2) Expose both a CLI and a Web interface (like javadoc)
3) Expose documentation in separate namespace, thus file, making version control easier.
3) Innovative documentation materials : examples, exercises, several level of details, etc. Structured semantics;

## Ideas
- Functions don't necessarily look like functions in the code, because of currying and all. It's ofen very hard to know how to call a functions by looking at the code.
- In a language such as Clojure (verbs, not nouns), documentation is best done by example.
- Documentation near the code is cumbersome. It's too bad to have such concise code and drowing it into ten times as much documentation. It makes the code harder to navigate.
- Some functions/macros are really meant to factor out/contract calls to some other functions. It may be a good thing that this be documented explicitly. Most programmers will look into the code anyway.
- Having explicit tags for documentation (e.g see-also, note, warning, tip, example, ...) makes life easier for bith the reader and the editor of the documentation. It also allows for rich presentation.
- 
## Usage

FIXME

## License

Copyright © 2014 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

# uochan-heroku

A Leiningen template for Heroku.

## Usage

 * create project
```
lein new uochan-heroku foo
cd foo
```
 * run in local
```
lein run
lein dev-run
```

 * deploy to heroku
```
heroku login
git init
git add .
git commit -am "first commit"
heroku apps:create
git push heroku master
heroku open
```

## License

Copyright (c) 2015 [uochan](http://twitter.com/uochan)

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

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

 * deploy to heroku (using [beco](https://github.com/liquidz/beco))
```
beco -i -c heroku /heroku_login.sh
git init
git add .
git commit -am "first commit"
beco heroku apps:create
beco -c heroku git push heroku master
```

## License

Copyright (c) 2015 [uochan](http://twitter.com/uochan)

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

# Kattis Solutions

This is a repository to store my solutions to [Kattis](https://www.kattis.com/developers) problems.  

## Workflow

My workflow is heavily simplified by using [Kat](https://github.com/Duckapple/Kat) - a CLI tool to interact
with the kattis API with ease and speed.

:sparkles: It was developed by peers from [ITU](www.en.itu.dk) - so make sure to check it out!

To **get single problems**, run (this creates a directory with the boilerplate file, test cases and opens the problem in the default web browser)

```bash
kattis get -o <problem_id>
```

To **test any version of the solution** against the cases, I run

```bash
kattis watch <problem_id>
```

Lastly, to verify that all tests pass, I run ```kattis test <problem_id>```. If all tests pass, submit the problem using

```bash
kattis submit <problem_id>
```

If I want to get all problems associated to a kattis contest (like [Lille Kat](https://www.github.io.)) run 

```bash
kattis contest <contest_id>
```

*You can find the contest id from the last subroute of the contest url url.*

## Boilerplate

Kat has a functionality to create boilerplate files for different programming languages. However, since I 
would like my boilerplates to work platform independent, I created boilerplate files for each languages as 
snippets (using the [luasnippet](https://github.com/L3MON4D3/LuaSnip) neovim plugin).

To see the configurations for each language, visit the custom luasnippets [here](https://github.com/jonas-mika/dotfiles/tree/main/.config/nvim/luasnippets).

## Ranking

Find my public kattis profile [here](https://open.kattis.com/users/jonasmika).

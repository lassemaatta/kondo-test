#!/usr/bin/env bash

clj-kondo --lint $(lein classpath) --dependencies --parallel --copy-configs

clj-kondo --lint src/

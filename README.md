minimal-scala-akka-http-seed.g8
=========================

## To create a new project run

```
sbt new yeghishe/minimal-scala-akka-http-seed.g8
```

## Overview

Once the project is generated you get few things out of the box:
* Most of the wiring is done in [Main](https://github.com/yeghishe/minimal-scala-akka-http-seed/blob/master/src/main/scala/io/github/yeghishe/Main.scala) file. Create new endpoints and add them to [this map](https://github.com/yeghishe/minimal-scala-akka-http-seed/blob/master/src/main/scala/io/github/yeghishe/Main.scala#L23), it will do the rest of wiring for you (status "path" in the map will become `/v1/status` endpoint). Think of those key-value mappings as /status is the prefix for all status routes, and there is a base prefix /v1.
* [Config](https://github.com/yeghishe/minimal-scala-akka-http-seed/blob/master/src/main/scala/io/github/yeghishe/Config.scala) is handled using [Ficus](https://github.com/ceedubs/ficus). Make sure to create your case classes for new config values you add in typesafe config. You can later mix in `Config` trait or import your values from `Config` object.
* [Circe](https://github.com/circe/circe) for json encoding and decoding.
* The project comes with [Cats](http://typelevel.org/cats/) library also.
* [StatusService](https://github.com/yeghishe/minimal-scala-akka-http-seed/blob/master/src/main/scala/io/github/yeghishe/StatusService.scala) which is more of a health check endpoint but the real goal is to act as a demo service. You'll be spending most of your time creating services and wiring those in Main file.
* [package](https://github.com/yeghishe/minimal-scala-akka-http-seed/blob/master/src/main/scala/io/github/yeghishe/package.scala) objects contains base classes so you don't have to repeat yourself for every service you create.
* The project uses [ScalaTest](http://www.scalatest.org/) for unit testing. Extend from [ServiceTestBase](https://github.com/yeghishe/minimal-scala-akka-http-seed/blob/master/src/test/scala/io/github/yeghishe/ServiceTestBase.scala) for your route tests. See [StatusServiceTest](https://github.com/yeghishe/minimal-scala-akka-http-seed/blob/master/src/test/scala/io/github/yeghishe/StatusServiceTest.scala) as an example.
* [Scalafmt](https://github.com/olafurpg/scalafmt) is being used for code formatting.
* [Scalastyle](http://www.scalastyle.org/) is being used fro code style checking.
* [Scoverage](https://github.com/scoverage/sbt-scoverage) is being used for code coverage .
* [Sbt Revolve](https://github.com/spray/sbt-revolver) is being used for local development.
* [Sbt native packager](https://github.com/sbt/sbt-native-packager) is being used  for packaging and deployment.

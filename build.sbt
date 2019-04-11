name := "sample-scala-repo"
version := "0.0.1-SNAPSHOT"

scalaVersion := "2.12.7"

scalacOptions ++= Seq(
  "-encoding", "UTF-8",   // source files are in UTF-8
  "-deprecation",         // warn about use of deprecated APIs
  "-unchecked",           // warn about unchecked type parameters
  "-feature",             // warn about misused language features
  "-language:higherKinds",// allow higher kinded types without `import scala.language.higherKinds`
  "-Xlint",               // enable handy linter warnings
  "-Xfatal-warnings",     // turn compiler warnings into errors
  "-Ypartial-unification" // allow the compiler to unify type constructors of different arities
)

val monocleVersion = "1.4.0" // 1.5.0-cats based on cats 1.0.x

libraryDependencies ++= Seq(
  "com.github.julien-truffaut" %%  "monocle-core"  % monocleVersion,
  "com.github.julien-truffaut" %%  "monocle-macro" % monocleVersion,
  "com.github.julien-truffaut" %%  "monocle-law"   % monocleVersion % "test"
)

// libraryDependencies += "org.typelevel" %% "cats-core" % "1.4.0"
libraryDependencies += "org.typelevel" %% "cats-mtl-core" % "0.5.0"
libraryDependencies += "org.typelevel" %% "kittens" % "1.0.0"
libraryDependencies += "com.github.alexarchambault" %% "case-app" % "1.0.0"
libraryDependencies ++= Seq(
  "eu.timepit" %% "refined"                 % "0.9.1"
)
// addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.3")

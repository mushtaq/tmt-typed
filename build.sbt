inThisBuild(
  Seq(
    scalaVersion := "2.12.10",
    crossScalaVersions := List("2.12.10", "2.13.6"),
    version := "0.1.0-SNAPSHOT",
    organization := "com.github.mushtaq.tmt-typed",
    organizationName := "ThoughtWorks",
    scalacOptions ++= Seq(
      "-encoding",
      "UTF-8",
      "-feature",
      "-unchecked",
      "-deprecation",
      //"-Wconf:any:warning-verbose",
      //"-Wdead-code",
      "-Xlint:_,-missing-interpolator",
      "-Xsource:3",
      "-Xcheckinit"
//      "-Xasync" does not work with Scala.js js yet
    ),
    sources in (Compile, doc) := Nil,
    publishArtifact in (Compile, packageDoc) := false
  )
)

lazy val `tmt-typed-root` = project
  .in(file("."))
  .aggregate(`tmt-typed`)

lazy val `tmt-typed` = project
  .enablePlugins(ScalablyTypedConverterGenSourcePlugin)
  .settings(
    Compile / npmDependencies ++= Seq(
      "@microsoft/fetch-event-source"   -> "^2.0.0",
      "@types/rsocket-websocket-client" -> "^0.0.4",
      "typescript"                      -> "^4.2.2"
    ),
    stEnableScalaJsDefined := Selection.All,
    stStdlib := List("ESNext", "DOM", "DOM.Iterable", "ScriptHost"),
    stOutputPackage := "tmttyped",
    stSourceGenMode := SourceGenMode.Manual((Compile / scalaSource).value)
  )

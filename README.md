Sample project to demonstrate problem of depending on minimatch

```
[info] Loading project definition from /home/naksu/scalajs-dependency-problem/project
[info] Updating {file:/home/naksu/scalajs-dependency-problem/project/}ui-build...
[info] Resolving org.fusesource.jansi#jansi;1.4 ...
[info] Done updating.
[info] Set current project to example (in build file:/home/naksu/scalajs-dependency-problem/)
[info] Updating {file:/home/naksu/scalajs-dependency-problem/}ui...
[info] Resolving org.webjars.npm#minimatch;[2,3),[3,4) ...
[warn]  module not found: org.webjars.npm#minimatch;[2,3),[3,4)
[warn] ==== local: tried
[warn]   /home/naksu/.ivy2/local/org.webjars.npm/minimatch/[2,3),[3,4)/ivys/ivy.xml
[warn] ==== jcenter: tried
[warn]   https://jcenter.bintray.com/org/webjars/npm/minimatch/[2,3),[3,4)/minimatch-[2,3),[3,4).pom
[warn] ==== public: tried
[warn]   https://repo1.maven.org/maven2/org/webjars/npm/minimatch/[2,3),[3,4)/minimatch-[2,3),[3,4).pom
[info] Resolving org.eclipse.jetty#jetty-continuation;8.1.16.v20140903 ...
[warn]  ::::::::::::::::::::::::::::::::::::::::::::::
[warn]  ::          UNRESOLVED DEPENDENCIES         ::
[warn]  ::::::::::::::::::::::::::::::::::::::::::::::
[warn]  :: org.webjars.npm#minimatch;[2,3),[3,4): not found
[warn]  ::::::::::::::::::::::::::::::::::::::::::::::
[warn]
[warn]  Note: Unresolved dependencies path:
[warn]    org.webjars.npm:minimatch:[2,3),[3,4)
[warn]      +- org.webjars.npm:glob:[5.0.10,6)
[warn]      +- org.webjars.npm:protobufjs:5.0.0 ((org.scalajs.sbtplugin.ScalaJSPluginInternal) ScalaJSPluginInternal.scala#L600)
[warn]      +- example:example_sjs0.6_2.11:0.1-SNAPSHOT
```

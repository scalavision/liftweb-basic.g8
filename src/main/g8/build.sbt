name := $name$
version := "0.1-SNAPSHOT"
organization := "com.scalavision"

enablePlugins(JettyPlugin)
//unmanagedResourceDirectories in Test += (baseDirectory.value) { _ / "src/main/webapp" }

libraryDependencies ++= liftWebPgDeps.value

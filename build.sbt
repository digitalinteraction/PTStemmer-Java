organization := "br.com.socialsla"
name := "ptstemmer-java"
version := "0.3.b1"

javaSource in Compile := baseDirectory.value / "src"
javacOptions in Compile ++= Seq("-encoding", "UTF-8")
unmanagedResourceDirectories in Compile += baseDirectory.value / "src"
includeFilter in (Compile, unmanagedResources) := "*.xml"

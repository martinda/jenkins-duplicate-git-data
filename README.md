Jenkins Duplicate Git Build Data
===
Example of UI problems caused by [JENKINS-29326](https://issues.jenkins-ci.org/browse/JENKINS-29326)
and [JENKINS-29840](https://issues.jenkins-ci.org/browse/JENKINS-29840).

Simply setup your Workflow Jenkins job to the following:
<pre>
Workflow definition
Workflow Script from SCM
Repository: https://github.com/martinda/jenkins-duplicate-git-data.git
Additional behavior: Custom SCM Name: Unique SCM Name: Workflow
Script Path: flow.groovy
</pre>

Then run the build. You will see on the left hand side navigation menu duplicate entries for all Git repositories
used by the build. IMO there should be no duplicate.

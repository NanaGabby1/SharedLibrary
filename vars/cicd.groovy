def newGit(repo)
{
  git "${repo}"
}

def newMaven()
{
  sh 'mvn package'
}

def newDeploy(ip,contextpath)
{
deploy adapters: [tomcat9(credentialsId: '3e78adb9-a385-4254-a1f1-2cda4ac89aca', path: '', url: "${ip}")], contextpath: "${contextpath}", war: '**/*.war' 
}
def runSelenium(path)
{
  sh 'java -jar /home/ubuntu/.jenkins/workspace/"${path}"/testing.jar'
}

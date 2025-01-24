@NonCPS
def call(String prevBuildAppName, String dockerCreds, String version){
  withCredentials([usernamePassword(credentialsId:${dockerCreds}, usernameVariable:"username", passwordVariable:"password")]){
      sh "docker login -u ${env.username} -p ${env.password}"
      sh "docker image tag ${preBuildAppName} ${env.username}/${preBuildAppName}:${version}"
      sh "docker push ${env.username}/${preBuildAppName}:${version}"
  }
}


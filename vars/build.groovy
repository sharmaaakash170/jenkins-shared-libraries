def call(String image, String version){
  sh "docker build -t ${image}:${version} ."
}

def call(Map args){
  def image = args.image
  def version = args.version
  sh "docker build -t ${image}:${version} ."
}

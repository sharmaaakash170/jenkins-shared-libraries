def call(String url, String branch){
  echo "Hi this is cloned"
  git url: "${url}", branch: "${branch}"  
}

node('remote') {
  checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'ScmName', name: 'axion-release-plugin']], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/allegro/axion-release-plugin.git']]])
  checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'ScmName', name: 'gradle-simple-plugin']], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/martinda/gradle-simple-plugin.git']]])
}

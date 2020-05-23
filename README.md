# Boot Container

Build an image of a sample spring boot app with [jib](https://github.com/GoogleContainerTools/jib)

## Prerequisites:
- Have a docker account or a local registry
- Configure the registry in maven settings.xml (in servers section)

## Build:
`./mvnw compile jib:build -Dimage=cboivin/boot-container`

## Run
`docker run -p8080:8080 cboivin/boot-container`  
Go to http://localhost:8080/test

## TODO
[ ] Test custom entrypoint
[ ] Build without pushing image ?
[ ] Run in kubernetes


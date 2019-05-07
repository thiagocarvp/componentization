# componentization

A Clojure server with components and http.

## Usage

### Leining
To run:
`lein run`

### Docker
To build the image:
`docker build -t <image-name> .`

To run the image created:
`docker run -p 8080:8080 <image-name>`

To deploy to a stack:
`docker stack deploy -c docker-compose.yml <stack-name>`

## License

Copyright © 2019 Thiago de Carvalho Pinto

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.

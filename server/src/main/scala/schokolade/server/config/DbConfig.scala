package schokolade.server.config

case class DbConfig(
    driver: String,
    url: String,
    user: String,
    password: String
)
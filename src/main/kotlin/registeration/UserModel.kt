package registeration

import java.io.Serializable

data class UserModel(
    var name: String,
    var email: String,
    var password: String
) : Serializable

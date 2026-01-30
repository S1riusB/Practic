package block10_AdvancedFeatures

/*
    Q25: Implement a sealed class NetworkResponse with subclasses Success, Error, and Loading.
    Write a function that takes a NetworkResponse and uses a when expression to handle each case.

 */

sealed class NetworkResponse {
    data class Success(val text: String) : NetworkResponse()
    data class Error(val text: String) : NetworkResponse()
    class Loading : NetworkResponse()
}

fun handleFunc(response: NetworkResponse) {
    when (response) {
        is NetworkResponse.Success -> println("Success! Data: ${response.text}")
        is NetworkResponse.Error -> println("Error message: ${response.text}")
        is NetworkResponse.Loading -> println("Loading...")
    }
}

fun main() {
    val status1 = NetworkResponse.Loading()
    val status2 = NetworkResponse.Success("Hello World!")
    val status3 = NetworkResponse.Error("Error 404!")

    handleFunc(status1)
    handleFunc(status2)
    handleFunc(status3)
}
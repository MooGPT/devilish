import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class CreateMyDevilish : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_my_devilish)

        val user = MyDevilish(
            name = "My Devilish",
            email = "email@moogpt.kr",
            password = "abc123",
            profilePictureUrl = "https://private-user-images.githubusercontent.com/180175560/373643831-c8b4692d-b2f2-452c-9e9f-147b5c84509a.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MjgwNDY2NTAsIm5iZiI6MTcyODA0NjM1MCwicGF0aCI6Ii8xODAxNzU1NjAvMzczNjQzODMxLWM4YjQ2OTJkLWIyZjItNDUyYy05ZTlmLTE0N2I1Yzg0NTA5YS5wbmc_WC1BbXotQWxnb3JpdGhtPUFXUzQtSE1BQy1TSEEyNTYmWC1BbXotQ3JlZGVudGlhbD1BS0lBVkNPRFlMU0E1M1BRSzRaQSUyRjIwMjQxMDA0JTJGdXMtZWFzdC0xJTJGczMlMkZhd3M0X3JlcXVlc3QmWC1BbXotRGF0ZT0yMDI0MTAwNFQxMjUyMzBaJlgtQW16LUV4cGlyZXM9MzAwJlgtQW16LVNpZ25hdHVyZT0yNWNlZjNiNzg2YjA4MTM3YTE4YzAwNWE3OTc5ZGRiYjBjNzFiMjgxZmVjNmM1ZmE4YTQ4NmM1MWQzNjUzZjBmJlgtQW16LVNpZ25lZEhlYWRlcnM9aG9zdCJ9.KS7ImyD5UXBURlrQQ_AP-9Z8w58BLbIN491XINcZwsE"
        )

        // Example: Display the user's data
        println("You can passed username $user added!")
        
        // You might want to save this user data to a database or shared preferences.
    }
}

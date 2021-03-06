package by.gmail.vehicle.data.net

import by.gmail.vehicle.data.entity.vehicle.VehicleResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

internal interface ApiRest {

    @GET("t/fake-api/car-service.php")
    fun getVehicle(
        @Query("p1Lat") p1Lat: Double,
        @Query("p1Lon") p1Lon: Double,
        @Query("p2Lat") p2Lat: Double,
        @Query("p2Lon") p2Lon: Double
    ): Single<List<VehicleResponse>>
}
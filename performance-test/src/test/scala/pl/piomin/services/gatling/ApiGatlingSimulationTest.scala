package pl.piomin.services.gatling

import io.gatling.core.scenario.Simulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import java.util.Date
import scala.concurrent.duration.FiniteDuration
import scala.concurrent.duration.Duration
import java.util.concurrent.TimeUnit
import scala.util.Random

class ApiGatlingSimulationTest extends Simulation {

  val scn = scenario("AddAndFindSmartTransactions").repeat(500, "n") {
        exec(
          http("GetSmartTransactions-API")
            .get("http://localhost:8090/smart-service/smart-transactions")
            .check(status.is(200))
        )   
  }
  
  setUp(scn.inject(atOnceUsers(20))).maxDuration(FiniteDuration.apply(10, "minutes"))
  
}
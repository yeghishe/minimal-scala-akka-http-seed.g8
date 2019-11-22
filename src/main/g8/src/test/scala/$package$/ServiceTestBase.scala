package $package$

import akka.event.{LoggingAdapter, NoLogging}
import akka.http.scaladsl.testkit.ScalatestRouteTest
import org.scalamock.scalatest.MockFactory
import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

trait ServiceTestBase
    extends AnyWordSpec
    with Matchers
    with ScalatestRouteTest
    with MockFactory {
  protected def log: LoggingAdapter = NoLogging
}

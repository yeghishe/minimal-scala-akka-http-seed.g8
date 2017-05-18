package $organization$

import akka.event.LoggingAdapter
import akka.http.scaladsl.server.Route
import de.heikoseeberger.akkahttpcirce.FailFastCirceSupport

import scala.concurrent.ExecutionContext

package object $name;format="norm,word"$ {
  trait BaseComponent extends Config {
    protected implicit def log: LoggingAdapter
    protected implicit def executor: ExecutionContext
  }

  trait BaseService extends BaseComponent with FailFastCirceSupport {
    protected def routes: Route
  }
}

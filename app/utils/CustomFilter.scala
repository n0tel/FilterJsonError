package utils

import play.api.mvc.{Filter, RequestHeader, Result, Action}

import scala.concurrent.Future

class CustomFilter extends Filter {

  override def apply(next: RequestHeader => Future[Result])(
    request: RequestHeader): Future[Result] = {

    val action = Action.async { r =>
      next(request)
    }

    action(request).run
  }
}
package utils

import javax.inject.Inject
import play.api.http.HttpFilters

class Filters @Inject() (
  customFilter: CustomFilter
) extends HttpFilters {
  val filters = Seq(customFilter)
}
package dev.soaresenzo.plugins

import dev.soaresenzo.routes.customerRouting
import dev.soaresenzo.routes.getOrderRoute
import dev.soaresenzo.routes.listOrdersRoute
import dev.soaresenzo.routes.totalizeOrderRoute
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {
    routing {
        customerRouting()
        listOrdersRoute()
        getOrderRoute()
        totalizeOrderRoute()
    }
}

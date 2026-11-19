package com.example.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Agriculture
import androidx.compose.material.icons.filled.Badge
import androidx.compose.material.icons.filled.Carpenter
import androidx.compose.material.icons.filled.CleaningServices
import androidx.compose.material.icons.filled.Construction
import androidx.compose.material.icons.filled.DeliveryDining
import androidx.compose.material.icons.filled.DirectionsCar
import androidx.compose.material.icons.filled.ElectricalServices
import androidx.compose.material.icons.filled.Engineering
import androidx.compose.material.icons.filled.Factory
import androidx.compose.material.icons.filled.FormatPaint
import androidx.compose.material.icons.filled.GridView
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Hotel
import androidx.compose.material.icons.filled.Inventory2
import androidx.compose.material.icons.filled.MoreHoriz
import androidx.compose.material.icons.filled.Plumbing
import androidx.compose.material.icons.filled.PrecisionManufacturing
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material.icons.filled.RoomService
import androidx.compose.material.icons.filled.Security
import androidx.compose.material.icons.filled.Storefront
import androidx.compose.material.icons.filled.Whatshot
import androidx.compose.material.icons.filled.Work
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.domain.model.JobCategoryId

fun categoryIcon(id: JobCategoryId): ImageVector = when (id) {
    JobCategoryId.MASON -> Icons.Filled.Construction
    JobCategoryId.CONSTRUCTION_LABOUR -> Icons.Filled.Engineering
    JobCategoryId.GENERAL_LABOUR -> Icons.Filled.Work
    JobCategoryId.PLUMBER -> Icons.Filled.Plumbing
    JobCategoryId.ELECTRICIAN -> Icons.Filled.ElectricalServices
    JobCategoryId.PAINTER -> Icons.Filled.FormatPaint
    JobCategoryId.TILE_WORKER -> Icons.Filled.GridView
    JobCategoryId.CARPENTER -> Icons.Filled.Carpenter
    JobCategoryId.WELDER -> Icons.Filled.Whatshot
    JobCategoryId.HOTEL_STAFF -> Icons.Filled.Hotel
    JobCategoryId.COOK -> Icons.Filled.Restaurant
    JobCategoryId.WAITER -> Icons.Filled.RoomService
    JobCategoryId.HOUSEKEEPING -> Icons.Filled.CleaningServices
    JobCategoryId.SECURITY_GUARD -> Icons.Filled.Security
    JobCategoryId.DRIVER -> Icons.Filled.DirectionsCar
    JobCategoryId.DELIVERY_WORKER -> Icons.Filled.DeliveryDining
    JobCategoryId.FACTORY_WORKER -> Icons.Filled.Factory
    JobCategoryId.PACKING_WORKER -> Icons.Filled.Inventory2
    JobCategoryId.MACHINE_OPERATOR -> Icons.Filled.PrecisionManufacturing
    JobCategoryId.AGRICULTURE_WORKER -> Icons.Filled.Agriculture
    JobCategoryId.OFFICE_ASSISTANT -> Icons.Filled.Badge
    JobCategoryId.SHOP_STAFF -> Icons.Filled.Storefront
    JobCategoryId.DOMESTIC_WORKER -> Icons.Filled.Home
    JobCategoryId.OTHER_JOBS -> Icons.Filled.MoreHoriz
}

package com.tink.link.service.misc

import com.tink.link.model.Images

internal typealias ImagesDTO = se.tink.grpc.v1.models.Images

internal fun ImagesDTO.toImages() =
    Images(
        icon = iconUrl,
        banner = bannerUrl
    )
/*
 * Copyright (c) 2019. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

package jetbrains.letsPlot.intern.layer.geom

import jetbrains.letsPlot.intern.Options
import jetbrains.letsPlot.intern.layer.WithGroupOption

class BoxplotMapping(
    override var x: Any? = null,
    override val y: Any? = null,
    override var lower: Any? = null,
    override var middle: Any? = null,
    override var upper: Any? = null,
    override var ymin: Any? = null,
    override var ymax: Any? = null,
    override var alpha: Any? = null,
    override var color: Any? = null,
    override var fill: Any? = null,
    override var size: Any? = null,
    override var linetype: Any? = null,
    override var shape: Any? = null,
    override var width: Any? = null,
    override var group: Any? = null,
    override val weight: Any? = null
) : BoxplotAesthetics, WithGroupOption {
    override fun seal() = super.seal() + Options.of(
        "x" to x,
        "y" to y,
        "lower" to lower,
        "middle" to middle,
        "upper" to upper,
        "ymin" to ymin,
        "ymax" to ymax,
        "alpha" to alpha,
        "color" to color,
        "fill" to fill,
        "size" to size,
        "linetype" to linetype,
        "shape" to shape,
        "width" to width,
        "weight" to weight
    ) + group()
}

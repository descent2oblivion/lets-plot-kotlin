/*
 * Copyright (c) 2019. JetBrains s.r.o.
 * Use of this source code is governed by the MIT license that can be found in the LICENSE file.
 */

package jetbrains.letsPlot.intern.layer.geom

import jetbrains.datalore.plot.config.Option
import jetbrains.letsPlot.intern.Options
import jetbrains.letsPlot.intern.layer.stat.BoxplotStatParameters

interface BoxplotParameters : BoxplotStatParameters {
    val outlierColor: Any?
    val outlierFill: Any?
    val outlierShape: Any?
    val outlierSize: Any?
    val fatten: Any?

    override fun seal() = Options.of(
        Option.Geom.BoxplotOutlier.COLOR to outlierColor,
        Option.Geom.BoxplotOutlier.FILL to outlierFill,
        Option.Geom.BoxplotOutlier.SHAPE to outlierShape,
        Option.Geom.BoxplotOutlier.SIZE to outlierSize,
        Option.Geom.Boxplot.FATTEN to fatten
    ) + super.seal()
}

package jetbrains.datalorePlot.geom

import jetbrains.datalorePlot.Geom.area
import jetbrains.datalorePlot.Pos
import jetbrains.datalorePlot.Stat
import jetbrains.datalorePlot.intern.layer.LayerBase
import jetbrains.datalorePlot.intern.layer.PosOptions
import jetbrains.datalorePlot.intern.layer.StatOptions
import jetbrains.datalorePlot.intern.layer.stat.DensityAesthetics
import jetbrains.datalorePlot.intern.layer.stat.DensityMapping

@Suppress("ClassName", "unused")
class geom_density(
    data: Any? = null,
    stat: StatOptions = Stat.density(),
    position: PosOptions = Pos.identity,
    show_legend: Boolean = true,
    sampling: Any? = null,
    override val x: Double? = null,
    override val y: Double? = null,
    override val alpha: Double? = null,
    override val color: Any? = null,
    override val fill: Any? = null,
    override val linetype: Any? = null,
    override val size: Double? = null,
    override val weight: Any? = null,
    mapping: DensityMapping.() -> Unit = {}

) : DensityAesthetics,
    LayerBase(
        mapping = DensityMapping().apply(mapping).seal(),
        data = data,
        geom = area(),
        stat = stat,
        position = position,
        show_legend = show_legend,
        sampling = sampling
    )


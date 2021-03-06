# lets-plot-kotlin changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]
### Added
 - facet_grid() 
 - labs(), xlab(), ylab()

## [0.0.18-SNAPSHOT] - 2020-06-10
### Added
 - Geometries:
    - geom_crossbar()
    - geom_errorbar()
    - geom_freqpoly()
    - geom_linerange()
    - geom_pointrange()
    - geom_polygon()
    - geom_ribbon()
    - geom_step()    
    
 - Standardize input data series as List<*>:
    - Iterable<*>
    - Sequence<*>
    - Array<*>
    - ByteArray
    - ShortArray
    - IntArray
    - LongArray
    - FloatArray
    - DoubleArray
    - CharArray
 
 - Standardize values in the input data series:
    - Date, Instant and ZonedDateTime as the number of milliseconds from the epoch of 1970-01-01T00:00:00Z.
    - Char as string

### Fixed
 - geom_density: 
    - defaults: alpha=0, fill=white
    - support `weight` aesthetic

 - geom_histogram: added 'bin' parameters: binCount, binWidth, center, boundary.

## [0.0.17-SNAPSHOT] - 2020-06-02
### Changed
 - Upgraded Lets-Plot dependency to v.1.4.2. Now bundled with Jupyter Kotlin kernel. 

### Added
 - Support for Kotlin kernel in Datalore.
 - New initialization parameters: `isolatedFrame` (bool), `apiVersion` (str), `libraryVersion` (str).
 - `LetsPlot.showInfo()`.
 

## [0.0.11-SNAPSHOT] - 2020-05-19
### Changed
 - Upgrade Lets-Plot Maven artifact dependency to v.1.4.0 (lets-plot-common.jar etc.)
 - More slick shape for tooltips on the axis.

### Fixed
 - Severe performance degradation when using discrete scales [[#119](https://github.com/JetBrains/lets-plot/issues/119)].


## [0.0.10-SNAPSHOT] - 2020-03-26 (not published)
### Changed
- Upgrade Lets-Plot Maven artifact dependency to v.1.3.1 (lets-plot-common.jar, lets-plot-jfx.jar)
  
  What's new is 1.3.1:
    - SVG export: function `MonolithicAwt.buildSvgImagesFromRawSpecs` was deprecated and replaced with  
    `PlotSvgExport.buildSvgImageFromRawSpecs`. PlotSvgExport utility now generates single SVG image from `GGBunch` 
    (before it was separate SVG per plot in the bunch).
    - HTML export: New `PlotHtmlExport.buildHtmlFromRawSpecs` utility exports plot as a dynamic HTML page optionally
      wrapped into iframe (see `iFrame` parameter). 
    
    See updated demos in `exportSvgDemo` and `exportHtmlDemo` packages.  
    
    - `lets-plot-common` and `lets-plot-jfx` artifacts are included in [jcenter](https://bintray.com/bintray/jcenter) Maven repository.


## [0.0.9-SNAPSHOT] - 2020-01-21
### Added
- *GGBunch*. Combines several different plots into one graphical object.

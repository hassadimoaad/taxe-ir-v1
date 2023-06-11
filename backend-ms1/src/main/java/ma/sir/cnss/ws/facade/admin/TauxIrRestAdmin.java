package  ma.sir.cnss.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.cnss.bean.core.TauxIr;
import ma.sir.cnss.bean.history.TauxIrHistory;
import ma.sir.cnss.dao.criteria.core.TauxIrCriteria;
import ma.sir.cnss.dao.criteria.history.TauxIrHistoryCriteria;
import ma.sir.cnss.service.facade.admin.TauxIrAdminService;
import ma.sir.cnss.ws.converter.TauxIrConverter;
import ma.sir.cnss.ws.dto.TauxIrDto;
import ma.sir.cnss.zynerator.controller.AbstractController;
import ma.sir.cnss.zynerator.dto.AuditEntityDto;
import ma.sir.cnss.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.sir.cnss.zynerator.process.Result;


import org.springframework.web.multipart.MultipartFile;
import ma.sir.cnss.zynerator.dto.FileTempDto;

@Api("Manages tauxIr services")
@RestController
@RequestMapping("/api/admin/tauxIr/")
public class TauxIrRestAdmin  extends AbstractController<TauxIr, TauxIrDto, TauxIrHistory, TauxIrCriteria, TauxIrHistoryCriteria, TauxIrAdminService, TauxIrConverter> {



    @ApiOperation("upload one tauxIr")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple tauxIrs")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all tauxIrs")
    @GetMapping("")
    public ResponseEntity<List<TauxIrDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a tauxIr by id")
    @GetMapping("id/{id}")
    public ResponseEntity<TauxIrDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  tauxIr")
    @PostMapping("")
    public ResponseEntity<TauxIrDto> save(@RequestBody TauxIrDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  tauxIr")
    @PutMapping("")
    public ResponseEntity<TauxIrDto> update(@RequestBody TauxIrDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of tauxIr")
    @PostMapping("multiple")
    public ResponseEntity<List<TauxIrDto>> delete(@RequestBody List<TauxIrDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified tauxIr")
    @DeleteMapping("")
    public ResponseEntity<TauxIrDto> delete(@RequestBody TauxIrDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified tauxIr")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple tauxIrs by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds tauxIrs by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<TauxIrDto>> findByCriteria(@RequestBody TauxIrCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated tauxIrs by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TauxIrCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports tauxIrs by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody TauxIrCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets tauxIr data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody TauxIrCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets tauxIr history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets tauxIr paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody TauxIrHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports tauxIr history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody TauxIrHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets tauxIr history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody TauxIrHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public TauxIrRestAdmin (TauxIrAdminService service, TauxIrConverter converter) {
        super(service, converter);
    }


}
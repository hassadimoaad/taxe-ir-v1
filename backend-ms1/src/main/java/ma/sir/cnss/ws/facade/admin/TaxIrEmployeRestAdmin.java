package  ma.sir.cnss.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.cnss.bean.core.TaxIrEmploye;
import ma.sir.cnss.bean.history.TaxIrEmployeHistory;
import ma.sir.cnss.dao.criteria.core.TaxIrEmployeCriteria;
import ma.sir.cnss.dao.criteria.history.TaxIrEmployeHistoryCriteria;
import ma.sir.cnss.service.facade.admin.TaxIrEmployeAdminService;
import ma.sir.cnss.ws.converter.TaxIrEmployeConverter;
import ma.sir.cnss.ws.dto.TaxIrEmployeDto;
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

@Api("Manages taxIrEmploye services")
@RestController
@RequestMapping("/api/admin/taxIrEmploye/")
public class TaxIrEmployeRestAdmin  extends AbstractController<TaxIrEmploye, TaxIrEmployeDto, TaxIrEmployeHistory, TaxIrEmployeCriteria, TaxIrEmployeHistoryCriteria, TaxIrEmployeAdminService, TaxIrEmployeConverter> {



    @ApiOperation("upload one taxIrEmploye")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple taxIrEmployes")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all taxIrEmployes")
    @GetMapping("")
    public ResponseEntity<List<TaxIrEmployeDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a taxIrEmploye by id")
    @GetMapping("id/{id}")
    public ResponseEntity<TaxIrEmployeDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  taxIrEmploye")
    @PostMapping("")
    public ResponseEntity<TaxIrEmployeDto> save(@RequestBody TaxIrEmployeDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  taxIrEmploye")
    @PutMapping("")
    public ResponseEntity<TaxIrEmployeDto> update(@RequestBody TaxIrEmployeDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of taxIrEmploye")
    @PostMapping("multiple")
    public ResponseEntity<List<TaxIrEmployeDto>> delete(@RequestBody List<TaxIrEmployeDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified taxIrEmploye")
    @DeleteMapping("")
    public ResponseEntity<TaxIrEmployeDto> delete(@RequestBody TaxIrEmployeDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified taxIrEmploye")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple taxIrEmployes by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by employe id")
    @GetMapping("employe/id/{id}")
    public List<TaxIrEmploye> findByEmployeId(@PathVariable Long id){
        return service.findByEmployeId(id);
    }
    @ApiOperation("delete by employe id")
    @DeleteMapping("employe/id/{id}")
    public int deleteByEmployeId(@PathVariable Long id){
        return service.deleteByEmployeId(id);
    }
    @ApiOperation("find by tauxIr id")
    @GetMapping("tauxIr/id/{id}")
    public List<TaxIrEmploye> findByTauxIrId(@PathVariable Long id){
        return service.findByTauxIrId(id);
    }
    @ApiOperation("delete by tauxIr id")
    @DeleteMapping("tauxIr/id/{id}")
    public int deleteByTauxIrId(@PathVariable Long id){
        return service.deleteByTauxIrId(id);
    }
    @ApiOperation("find by taxIr id")
    @GetMapping("taxIr/id/{id}")
    public List<TaxIrEmploye> findByTaxIrId(@PathVariable Long id){
        return service.findByTaxIrId(id);
    }
    @ApiOperation("delete by taxIr id")
    @DeleteMapping("taxIr/id/{id}")
    public int deleteByTaxIrId(@PathVariable Long id){
        return service.deleteByTaxIrId(id);
    }
    @ApiOperation("Finds taxIrEmployes by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<TaxIrEmployeDto>> findByCriteria(@RequestBody TaxIrEmployeCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated taxIrEmployes by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TaxIrEmployeCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports taxIrEmployes by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody TaxIrEmployeCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets taxIrEmploye data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody TaxIrEmployeCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets taxIrEmploye history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets taxIrEmploye paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody TaxIrEmployeHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports taxIrEmploye history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody TaxIrEmployeHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets taxIrEmploye history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody TaxIrEmployeHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public TaxIrEmployeRestAdmin (TaxIrEmployeAdminService service, TaxIrEmployeConverter converter) {
        super(service, converter);
    }


}
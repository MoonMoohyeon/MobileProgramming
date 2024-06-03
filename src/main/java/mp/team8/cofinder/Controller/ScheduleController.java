package mp.team8.cofinder.Controller;

import mp.team8.cofinder.Entity.Schedule;
import mp.team8.cofinder.Service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schedules")
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;

    @PostMapping
    public ResponseEntity<Schedule> addSchedule(@RequestBody Schedule schedule) {
        Schedule newSchedule = scheduleService.addSchedule(schedule);
        return ResponseEntity.ok(newSchedule);
    }

    @GetMapping("/{teamId}")
    public ResponseEntity<List<Schedule>> getSchedulesByTeam(@PathVariable Long teamId) {
        List<Schedule> schedules = scheduleService.getSchedulesByTeam(teamId);
        return ResponseEntity.ok(schedules);
    }
}

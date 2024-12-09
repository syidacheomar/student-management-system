class Student {
    constructor(name, mathScores, scienceScores, englishScores) {
        this.name = name;
        this.scores = [mathScores, scienceScores, englishScores];
        this.averageScore = this.calculateAverage();
    }

    calculateAverage() {
        const sum = this.scores.reduce((a, b) => a + b, 0);
        return sum / this.scores.length;
    }

    assignGrade() {
        const average = this.averageScore;
        if (average >= 90) return 'A';
        if (average >= 80) return 'B';
        if (average >= 70) return 'C';
        if (average >= 60) return 'D';
        return 'F';
    }

    displayStudentDetails() {
        return `
            <div>
                <p>Student Name: ${this.name}</p>
                <p>Average Score: ${this.averageScore.toFixed(2)}</p>
                <p>Grade: ${this.assignGrade()}</p>
            </div>
        `;
    }
}

const students = [];

function addStudent() {
    const name = document.getElementById('name').value;
    const mathScores = parseInt(document.getElementById('mathScores').value);
    const scienceScores = parseInt(document.getElementById('scienceScores').value);
    const englishScores = parseInt(document.getElementById('englishScores').value);

    const student = new Student(name, mathScores, scienceScores, englishScores);
    students.push(student);

    displayStudents();
}

function displayStudents() {
    const studentDetails = document.getElementById('studentDetails');
    studentDetails.innerHTML = students.map(student => student.displayStudentDetails()).join('');
}

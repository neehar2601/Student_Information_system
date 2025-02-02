## Student Information System

### Problem Statement

Learners can enroll in a **classroom course** at an affiliated school. They can choose to do this for a specific **college session**, such as **Summer or Winter**.

Alternatively, students can opt to complete an **online course**, which consists of a specific number of **video lessons**. Students will have a set number of weeks to complete the course.

In both the **classroom** and **online** versions of the course, students must complete all assignments.

Upon completion of the course, students must take a **quiz**. The final grade is calculated as the **average of marks in assignments and quizzes**.  

If a student attains a **minimum grade of 5 out of 10**, the university awards them a **Certificate of Success** or a **Certificate of Completion**.




# Initialize a Git repository (if not already initialized)
git init

# Remove existing remote origin (optional, if needed)
git remote remove origin

# Add the GitHub repository as the remote origin
git remote add origin https://github.com/neehar2601/Student_Information_system.git

# Verify the remote repository URL
git remote -v

# Add all files to staging
git add .

# Commit the changes with a message
git commit -m "Initial commit for Student Information System"

# Rename the branch to main (optional, but recommended)
git branch -M main

# Push the code to the remote repository on GitHub
git push -u origin main
